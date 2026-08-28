import java.util.List;
import java.util.function.Function;

public class gwk<S extends gzi, M extends gca<S>> extends gwr<S, M> {
   private final aku a;
   private final gwk.a<S> b;
   private final gwk.b<S, M> c;
   private final Function<aku, gmh> d;
   private final boolean e;

   public gwk(gtz<S, M> $$0, aku $$1, gwk.a<S> $$2, gwk.b<S, M> $$3, Function<aku, gmh> $$4, boolean $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public void a(ffu $$0, glx $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z || this.e) {
         if (this.a($$3)) {
            ffy $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.u);
            int $$8 = axk.a(ayz.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gtd.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gfc> $$1 = this.c.getPartsToDraw(this.d(), $$0);
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

   public interface a<S extends gzi> {
      float apply(S var1, float var2);
   }

   public interface b<S extends gzi, M extends gca<S>> {
      List<gfc> getPartsToDraw(M var1, S var2);
   }
}
