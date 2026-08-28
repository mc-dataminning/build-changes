import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import it.unimi.dsi.fastutil.ints.IntPriorityQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class gpl {
   private static final int a = 4;
   private static final int b = 16;
   private static final int c = 15;
   private static final int d = 4096;
   private static final int e = 0;
   private static final int f = 4;
   private static final int g = 8;
   private static final int h = (int)Math.pow(16.0, 0.0);
   private static final int i = (int)Math.pow(16.0, 1.0);
   private static final int j = (int)Math.pow(16.0, 2.0);
   private static final int k = -1;
   private static final jn[] l = jn.values();
   private final BitSet m = new BitSet(4096);
   private static final int[] n = af.a(new int[1352], $$0 -> {
      int $$1 = 0;
      int $$2 = 15;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            for (int $$6 = 0; $$6 < 16; $$6++) {
               if ($$4 == 0 || $$4 == 15 || $$5 == 0 || $$5 == 15 || $$6 == 0 || $$6 == 15) {
                  $$0[$$3++] = a($$4, $$5, $$6);
               }
            }
         }
      }
   });
   private int o = 4096;

   public void a(ji $$0) {
      this.m.set(b($$0), true);
      this.o--;
   }

   private static int b(ji $$0) {
      return a($$0.u() & 15, $$0.v() & 15, $$0.w() & 15);
   }

   private static int a(int $$0, int $$1, int $$2) {
      return $$0 << 0 | $$1 << 8 | $$2 << 4;
   }

   public gpm a() {
      gpm $$0 = new gpm();
      if (4096 - this.o < 256) {
         $$0.a(true);
      } else if (this.o == 0) {
         $$0.a(false);
      } else {
         for (int $$1 : n) {
            if (!this.m.get($$1)) {
               $$0.a(this.a($$1));
            }
         }
      }

      return $$0;
   }

   private Set<jn> a(int $$0) {
      Set<jn> $$1 = EnumSet.noneOf(jn.class);
      IntPriorityQueue $$2 = new IntArrayFIFOQueue();
      $$2.enqueue($$0);
      this.m.set($$0, true);

      while (!$$2.isEmpty()) {
         int $$3 = $$2.dequeueInt();
         this.a($$3, $$1);

         for (jn $$4 : l) {
            int $$5 = this.a($$3, $$4);
            if ($$5 >= 0 && !this.m.get($$5)) {
               this.m.set($$5, true);
               $$2.enqueue($$5);
            }
         }
      }

      return $$1;
   }

   private void a(int $$0, Set<jn> $$1) {
      int $$2 = $$0 >> 0 & 15;
      if ($$2 == 0) {
         $$1.add(jn.e);
      } else if ($$2 == 15) {
         $$1.add(jn.f);
      }

      int $$3 = $$0 >> 8 & 15;
      if ($$3 == 0) {
         $$1.add(jn.a);
      } else if ($$3 == 15) {
         $$1.add(jn.b);
      }

      int $$4 = $$0 >> 4 & 15;
      if ($$4 == 0) {
         $$1.add(jn.c);
      } else if ($$4 == 15) {
         $$1.add(jn.d);
      }
   }

   private int a(int $$0, jn $$1) {
      switch ($$1) {
         case a:
            if (($$0 >> 8 & 15) == 0) {
               return -1;
            }

            return $$0 - j;
         case b:
            if (($$0 >> 8 & 15) == 15) {
               return -1;
            }

            return $$0 + j;
         case c:
            if (($$0 >> 4 & 15) == 0) {
               return -1;
            }

            return $$0 - i;
         case d:
            if (($$0 >> 4 & 15) == 15) {
               return -1;
            }

            return $$0 + i;
         case e:
            if (($$0 >> 0 & 15) == 0) {
               return -1;
            }

            return $$0 - h;
         case f:
            if (($$0 >> 0 & 15) == 15) {
               return -1;
            }

            return $$0 + h;
         default:
            return -1;
      }
   }
}
