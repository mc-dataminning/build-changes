import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class zx implements va<ws> {
   private static final byte a = -128;
   private final int b;
   private final List<Pair<biq, cja>> c;

   public zx(int $$0, List<Pair<biq, cja>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public zx(sl $$0) {
      this.b = $$0.m();
      biq[] $$1 = biq.values();
      this.c = Lists.newArrayList();

      int $$2;
      do {
         $$2 = $$0.readByte();
         biq $$3 = $$1[$$2 & 127];
         cja $$4 = $$0.q();
         this.c.add(Pair.of($$3, $$4));
      } while (($$2 & -128) != 0);
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.b);
      int $$1 = this.c.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Pair<biq, cja> $$3 = this.c.get($$2);
         biq $$4 = (biq)$$3.getFirst();
         boolean $$5 = $$2 != $$1 - 1;
         int $$6 = $$4.ordinal();
         $$0.k($$5 ? $$6 | -128 : $$6);
         $$0.a((cja)$$3.getSecond());
      }
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public List<Pair<biq, cja>> d() {
      return this.c;
   }
}
