import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class zt implements uw<wo> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<bil, ciw>> c;

   public zt(int $$0, List<Pair<bil, ciw>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public zt(sh $$0) {
      this.b = $$0.m();
      bil[] $$1 = bil.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         bil $$3 = $$1[$$2 & 127];
         ciw $$4 = $$0.q();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<bil, ciw> $$3 = this.c.get($$2);
         bil $$4 = (bil)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((ciw)$$3.getSecond());
      }
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<bil, ciw>> d() {
      return this.c;
   }
}
