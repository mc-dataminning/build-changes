import java.util.Set;

public class gce extends gcr<gyw> {
   public static final ges a = new gag(true, 23.0F, 4.8F, 2.7F, 3.0F, 49.0F, Set.of("head"));

   public gce(gej $$0) {
      super($$0);
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a(
         "head",
         geo.c()
            .a(0, 6)
            .a(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F)
            .a(45, 16)
            .a("nose", -3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F)
            .a(52, 25)
            .a("left_ear", 3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F)
            .a(52, 25)
            .a("right_ear", -8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F),
         gel.a(0.0F, 11.5F, -17.0F)
      );
      $$1.a("body", geo.c().a(0, 25).a(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F), gel.a(0.0F, 10.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 9;
      int $$3 = 6;
      geo $$4 = geo.c().a(40, 0).a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      $$1.a("right_hind_leg", $$4, gel.a(-5.5F, 15.0F, 9.0F));
      $$1.a("left_hind_leg", $$4, gel.a(5.5F, 15.0F, 9.0F));
      $$1.a("right_front_leg", $$4, gel.a(-5.5F, 15.0F, -9.0F));
      $$1.a("left_front_leg", $$4, gel.a(5.5F, 15.0F, -9.0F));
      return gep.a($$0, 64, 64);
   }

   public void a(gyw $$0) {
      super.a($$0);
      if ($$0.b) {
         this.b.f = 0.35F * azu.a(0.6F * $$0.p);
         this.b.g = 0.35F * azu.a(0.6F * $$0.p);
         this.f.e = -0.75F * azu.a(0.3F * $$0.p);
         this.g.e = 0.75F * azu.a(0.3F * $$0.p);
      } else {
         this.b.g = 0.0F;
      }

      if ($$0.c) {
         if ($$0.d < 15) {
            this.b.e = (float) (-Math.PI / 4) * (float)$$0.d / 14.0F;
         } else if ($$0.d < 20) {
            float $$1 = (float)(($$0.d - 15) / 5);
            this.b.e = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * $$1;
         }
      }

      if ($$0.h > 0.0F) {
         this.c.e = azu.j($$0.h, this.c.e, 1.7407963F);
         this.b.e = azu.j($$0.h, this.b.e, (float) (Math.PI / 2));
         this.f.g = -0.27079642F;
         this.g.g = 0.27079642F;
         this.d.g = 0.5707964F;
         this.e.g = -0.5707964F;
         if ($$0.e) {
            this.b.e = (float) (Math.PI / 2) + 0.2F * azu.a($$0.p * 0.6F);
            this.f.e = -0.4F - 0.2F * azu.a($$0.p * 0.6F);
            this.g.e = -0.4F - 0.2F * azu.a($$0.p * 0.6F);
         }

         if ($$0.f) {
            this.b.e = 2.1707964F;
            this.f.e = -0.9F;
            this.g.e = -0.9F;
         }
      } else {
         this.d.g = 0.0F;
         this.e.g = 0.0F;
         this.f.g = 0.0F;
         this.g.g = 0.0F;
      }

      if ($$0.i > 0.0F) {
         this.d.e = -0.6F * azu.a($$0.p * 0.15F);
         this.e.e = 0.6F * azu.a($$0.p * 0.15F);
         this.f.e = 0.3F * azu.a($$0.p * 0.25F);
         this.g.e = -0.3F * azu.a($$0.p * 0.25F);
         this.b.e = azu.j($$0.i, this.b.e, (float) (Math.PI / 2));
      }

      if ($$0.j > 0.0F) {
         this.b.e = azu.j($$0.j, this.b.e, 2.0561945F);
         this.d.e = -0.5F * azu.a($$0.p * 0.5F);
         this.e.e = 0.5F * azu.a($$0.p * 0.5F);
         this.f.e = 0.5F * azu.a($$0.p * 0.5F);
         this.g.e = -0.5F * azu.a($$0.p * 0.5F);
      }
   }
}
