import java.util.List;
import java.util.function.Function;

public class hcc<S extends hfe, M extends ghn<S>> extends hcj<S, M> {
   private final alr a;
   private final hcc.a<S> b;
   private final hcc.b<S, M> c;
   private final Function<alr, gry> d;
   private final boolean e;

   public hcc(gzs<S, M> $$0, alr $$1, hcc.a<S> $$2, hcc.b<S, M> $$3, Function<alr, gry> $$4, boolean $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.A || this.e) {
         if (this.a($$3)) {
            flg $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.v);
            int $$8 = ayh.a(azz.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gyw.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gkr> $$1 = this.c.getPartsToDraw(this.d(), $$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         this.d().f().forEach($$0x -> $$0x.l = true);
         $$1.forEach($$0x -> $$0x.l = false);
         return true;
      }
   }

   private void a() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a<S extends hfe> {
      float apply(S var1, float var2);
   }

   public interface b<S extends hfe, M extends ghn<S>> {
      List<gkr> getPartsToDraw(M var1, S var2);
   }
}
