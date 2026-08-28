import java.util.List;
import java.util.function.Function;

public class gwn<S extends gzl, M extends gcc<S>> extends gwu<S, M> {
   private final akv a;
   private final gwn.a<S> b;
   private final gwn.b<S, M> c;
   private final Function<akv, gmj> d;
   private final boolean e;

   public gwn(guc<S, M> $$0, akv $$1, gwn.a<S> $$2, gwn.b<S, M> $$3, Function<akv, gmj> $$4, boolean $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public void a(ffv $$0, glz $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z || this.e) {
         if (this.a($$3)) {
            ffz $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.u);
            int $$8 = axk.a(ayz.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gtg.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gfe> $$1 = this.c.getPartsToDraw(this.d(), $$0);
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

   public interface a<S extends gzl> {
      float apply(S var1, float var2);
   }

   public interface b<S extends gzl, M extends gcc<S>> {
      List<gfe> getPartsToDraw(M var1, S var2);
   }
}
