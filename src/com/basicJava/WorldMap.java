//package com.basicJava;
//
//public class WorldMap{
//    //just for reference
//    Node{
//        //String NodeName;
//        Node parent;
//        boolean isLocked=false;
//        ArrayList<Node> children;
//        int CountOfLockedDesandants=0;
//    }
//    public String unlockTheNode(Node currentNode){
//        if(currentNode.isLocked==false)return "Cant UnLock The Node";
//        currentNode.isLocked=false;
//        Node CurParent=currentNode.parent;
//        while(CurParent!=null){
//            CurParent.CountOfLockedDesandants-=1;
//
//            CurParent=CurParent.parent;
//        }
//        return "UnLockedTheNode";
//    }
//    public String lockTheNode(Node currentNode){
//        if(cuurentNode.tempCount>0||!canLockUnlock(currentNode)){
//            return "Cant Lock The Node";
//        }
//        currentNode.isLocked=true;
//        Node CurParent=currentNode.parent;
//        while(CurParent!=null){
//            CurParent.CountOfLockedDesandants+=1;
//            CurParent.tempCount--;
//            CurParent=CurParent.parent;
//        }
//        return "LockedTheNode";
//    }
//    public boolean canLockUnlock(Node currNode){
//        if(currNode.CountOfLockedDesandants>0||currNode.temp>0)return false;
//        Node CurParent=currentNode.parent;
//        Node PrevNode=cuurentNode;
//        while(CurParent!=null){
//            CurParent.tempCount++;
//            curParent.child=prevNode;
//            if(CurParent.isLocked||CurParent.isRunning){
//                Node child=CurParent;
//                while(child!=currNode){
//                    child.tempCount--;
//                    child=child.children;
//                }
//                return false;
//            }
//            prevNode=CurParent;
//            CurParent=CurParent.parent;
//        }
//        return true;
//    }
//}
