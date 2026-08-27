import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class xz implements uo<ur> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bfo, cfz>> c;

   public xz(int $$0, List<Pair<bfo, cfz>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public xz(sf $$0) {
      this.b = $$0.m();
      bfo[] $$1 = bfo.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bfo $$3 = $$1[$$2 & 127];
         cfz $$4 = $$0.r();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bfo, cfz> $$3 = this.c.get($$2);
         bfo $$4 = (bfo)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.writeByte($$5 ? $$6 | -128 : $$6);
         $$0.a((cfz)$$3.getSecond());
      }
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bfo, cfz>> c() {
      return this.c;
   }
}
