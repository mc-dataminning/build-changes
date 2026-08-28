import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fvh extends fun<coq> {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "bottom";
   private final fwv g;
   private final fwv h;
   private final ImmutableList<fwv> i;

   public fvh(fwv $$0) {
      this.g = $$0.b("left_paddle");
      this.h = $$0.b("right_paddle");
      this.i = this.a($$0).build();
   }

   protected Builder<fwv> a(fwv $$0) {
      Builder<fwv> $$1 = new Builder();
      $$1.add(new fwv[]{$$0.b("bottom"), this.g, this.h});
      return $$1;
   }

   public static void a(fxe $$0) {
      $$0.a(
         "bottom",
         fxa.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         fwx.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         fxa.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fwx.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fxa.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fwx.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      a($$1);
      return fxb.a($$0, 128, 64);
   }

   public void a(coq $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.g, $$1);
      a($$0, 1, this.h, $$1);
   }

   public ImmutableList<fwv> c() {
      return this.i;
   }

   private static void a(coq $$0, int $$1, fwv $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = ayu.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (ayu.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = ayu.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (ayu.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
