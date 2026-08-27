import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class gib<T> {
   private static final boolean b = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
   private static final boolean c = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
   private static final Logger d = LogUtils.getLogger();
   private static final int e = -1;
   private static final int f = -2;
   protected final List<T> a = Lists.newArrayList();
   private final IntList g = new IntArrayList();
   private final IntList h = new IntArrayList();
   private IntList i = new IntArrayList();
   private IntList j = new IntArrayList();
   private int k;

   public void a(T $$0, String $$1) {
      this.k = Math.max(this.k, $$1.length());
      int $$2 = this.a.size();
      this.a.add($$0);
      this.h.add(this.g.size());

      for (int $$3 = 0; $$3 < $$1.length(); $$3++) {
         this.i.add($$2);
         this.j.add($$3);
         this.g.add($$1.charAt($$3));
      }

      this.i.add($$2);
      this.j.add($$1.length());
      this.g.add(-1);
   }

   public void a() {
      int $$0 = this.g.size();
      int[] $$1 = new int[$$0];
      int[] $$2 = new int[$$0];
      int[] $$3 = new int[$$0];
      int[] $$4 = new int[$$0];
      IntComparator $$5 = ($$2x, $$3x) -> $$2[$$2x] == $$2[$$3x] ? Integer.compare($$3[$$2x], $$3[$$3x]) : Integer.compare($$2[$$2x], $$2[$$3x]);
      Swapper $$6 = ($$3x, $$4x) -> {
         if ($$3x != $$4x) {
            int $$5x = $$2[$$3x];
            $$2[$$3x] = $$2[$$4x];
            $$2[$$4x] = $$5x;
            $$5x = $$3[$$3x];
            $$3[$$3x] = $$3[$$4x];
            $$3[$$4x] = $$5x;
            $$5x = $$4[$$3x];
            $$4[$$3x] = $$4[$$4x];
            $$4[$$4x] = $$5x;
         }
      };

      for (int $$7 = 0; $$7 < $$0; $$7++) {
         $$1[$$7] = this.g.getInt($$7);
      }

      int $$8 = 1;

      for (int $$9 = Math.min($$0, this.k); $$8 * 2 < $$9; $$8 *= 2) {
         for (int $$10 = 0; $$10 < $$0; $$4[$$10] = $$10++) {
            $$2[$$10] = $$1[$$10];
            $$3[$$10] = $$10 + $$8 < $$0 ? $$1[$$10 + $$8] : -2;
         }

         Arrays.quickSort(0, $$0, $$5, $$6);

         for (int $$11 = 0; $$11 < $$0; $$11++) {
            if ($$11 > 0 && $$2[$$11] == $$2[$$11 - 1] && $$3[$$11] == $$3[$$11 - 1]) {
               $$1[$$4[$$11]] = $$1[$$4[$$11 - 1]];
            } else {
               $$1[$$4[$$11]] = $$11;
            }
         }
      }

      IntList $$12 = this.i;
      IntList $$13 = this.j;
      this.i = new IntArrayList($$12.size());
      this.j = new IntArrayList($$13.size());

      for (int $$14 = 0; $$14 < $$0; $$14++) {
         int $$15 = $$4[$$14];
         this.i.add($$12.getInt($$15));
         this.j.add($$13.getInt($$15));
      }

      if (c) {
         this.b();
      }
   }

   private void b() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         d.debug("{} {}", $$0, this.a($$0));
      }

      d.debug("");
   }

   private String a(int $$0) {
      int $$1 = this.j.getInt($$0);
      int $$2 = this.h.getInt(this.i.getInt($$0));
      StringBuilder $$3 = new StringBuilder();

      for (int $$4 = 0; $$2 + $$4 < this.g.size(); $$4++) {
         if ($$4 == $$1) {
            $$3.append('^');
         }

         int $$5 = this.g.getInt($$2 + $$4);
         if ($$5 == -1) {
            break;
         }

         $$3.append((char)$$5);
      }

      return $$3.toString();
   }

   private int a(String $$0, int $$1) {
      int $$2 = this.h.getInt(this.i.getInt($$1));
      int $$3 = this.j.getInt($$1);

      for (int $$4 = 0; $$4 < $$0.length(); $$4++) {
         int $$5 = this.g.getInt($$2 + $$3 + $$4);
         if ($$5 == -1) {
            return 1;
         }

         char $$6 = $$0.charAt($$4);
         char $$7 = (char)$$5;
         if ($$6 < $$7) {
            return -1;
         }

         if ($$6 > $$7) {
            return 1;
         }
      }

      return 0;
   }

   public List<T> a(String $$0) {
      int $$1 = this.i.size();
      int $$2 = 0;
      int $$3 = $$1;

      while ($$2 < $$3) {
         int $$4 = $$2 + ($$3 - $$2) / 2;
         int $$5 = this.a($$0, $$4);
         if (b) {
            d.debug("comparing lower \"{}\" with {} \"{}\": {}", new Object[]{$$0, $$4, this.a($$4), $$5});
         }

         if ($$5 > 0) {
            $$2 = $$4 + 1;
         } else {
            $$3 = $$4;
         }
      }

      if ($$2 >= 0 && $$2 < $$1) {
         int $$6 = $$2;
         $$3 = $$1;

         while ($$2 < $$3) {
            int $$7 = $$2 + ($$3 - $$2) / 2;
            int $$8 = this.a($$0, $$7);
            if (b) {
               d.debug("comparing upper \"{}\" with {} \"{}\": {}", new Object[]{$$0, $$7, this.a($$7), $$8});
            }

            if ($$8 >= 0) {
               $$2 = $$7 + 1;
            } else {
               $$3 = $$7;
            }
         }

         int $$9 = $$2;
         IntSet $$10 = new IntOpenHashSet();

         for (int $$11 = $$6; $$11 < $$9; $$11++) {
            $$10.add(this.i.getInt($$11));
         }

         int[] $$12 = $$10.toIntArray();
         java.util.Arrays.sort($$12);
         Set<T> $$13 = Sets.newLinkedHashSet();

         for (int $$14 : $$12) {
            $$13.add(this.a.get($$14));
         }

         return Lists.newArrayList($$13);
      } else {
         return Collections.emptyList();
      }
   }
}
