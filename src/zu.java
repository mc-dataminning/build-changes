import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class zu implements ux<wp> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bin, cix>> c;

   public zu(int $$0, List<Pair<bin, cix>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public zu(si $$0) {
      this.b = $$0.m();
      bin[] $$1 = bin.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bin $$3 = $$1[$$2 & 127];
         cix $$4 = $$0.q();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bin, cix> $$3 = this.c.get($$2);
         bin $$4 = (bin)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cix)$$3.getSecond());
      }
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bin, cix>> d() {
      return this.c;
   }
}
