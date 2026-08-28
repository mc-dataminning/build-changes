import java.util.List;
import java.util.function.Function;

public class hba<S extends hdz, M extends ggk<S>> extends hbh<S, M> {
   private final alg a;
   private final hba.a<S> b;
   private final hba.b<S, M> c;
   private final Function<alg, gqx> d;
   private final boolean e;

   public hba(gyq<S, M> $$0, alg $$1, hba.a<S> $$2, hba.b<S, M> $$3, Function<alg, gqx> $$4, boolean $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public void a(fjy $$0, gqm $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z || this.e) {
         if (this.a($$3)) {
            fkc $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.u);
            int $$8 = axw.a(azm.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gxu.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gjo> $$1 = this.c.getPartsToDraw(this.d(), $$0);
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

   public interface a<S extends hdz> {
      float apply(S var1, float var2);
   }

   public interface b<S extends hdz, M extends ggk<S>> {
      List<gjo> getPartsToDraw(M var1, S var2);
   }
}
