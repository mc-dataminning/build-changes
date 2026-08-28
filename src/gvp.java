import javax.annotation.Nullable;

public class gvp implements dja {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gvo[] c;
   protected final djz d;

   gvp(djz $$0, int $$1, int $$2, gvo[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public ebg a_(iw $$0) {
      return this.a(jz.a($$0.u()), jz.a($$0.w())).b($$0);
   }

   @Override
   public exq b_(iw $$0) {
      return this.a(jz.a($$0.u()), jz.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jc $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public exf B_() {
      return this.d.B_();
   }

   @Nullable
   @Override
   public dye c_(iw $$0) {
      return this.a(jz.a($$0.u()), jz.a($$0.w())).a($$0);
   }

   private gvo a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(iw $$0, djj $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int K_() {
      return this.d.K_();
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
