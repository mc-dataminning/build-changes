import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fvu extends fva<coe> {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "bottom";
   private final fxi g;
   private final fxi h;
   private final ImmutableList<fxi> i;

   public fvu(fxi $$0) {
      this.g = $$0.b("left_paddle");
      this.h = $$0.b("right_paddle");
      this.i = this.a($$0).build();
   }

   protected Builder<fxi> a(fxi $$0) {
      Builder<fxi> $$1 = new Builder();
      $$1.add(new fxi[]{$$0.b("bottom"), this.g, this.h});
      return $$1;
   }

   public static void a(fxr $$0) {
      $$0.a(
         "bottom",
         fxn.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         fxk.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         fxn.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fxk.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fxn.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fxk.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      a($$1);
      return fxo.a($$0, 128, 64);
   }

   public void a(coe $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.g, $$1);
      a($$0, 1, this.h, $$1);
   }

   public ImmutableList<fxi> c() {
      return this.i;
   }

   private static void a(coe $$0, int $$1, fxi $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = aye.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (aye.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = aye.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (aye.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
