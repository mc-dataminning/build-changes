import javax.annotation.Nullable;

public class hbs<S extends hdq, M extends ggk<S>> extends hbh<S, M> {
   private final ggg a;
   private final ggg b;
   private final has c;

   public hbs(gyq<S, M> $$0, gjk $$1, has $$2) {
      super($$0);
      this.a = new ggg($$1.a(gjn.aP));
      this.b = new ggg($$1.a(gjn.aQ));
      this.c = $$2;
   }

   public void a(fjy $$0, gqm $$1, int $$2, S $$3, float $$4, float $$5) {
      czk $$6 = $$3.W;
      dht $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         alg $$8 = a($$3);
         ggg $$9 = $$3.aj ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(hlp.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static alg a(hdq $$0) {
      if ($$0 instanceof hel $$1) {
         hkl $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.ay) {
            return $$2.c();
         }
      }

      return null;
   }
}
