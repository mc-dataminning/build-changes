import javax.annotation.Nullable;

public class glg implements ddx {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final glf[] c;
   protected final dev d;

   glg(dev $$0, int $$1, int $$2, glf[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dvd a_(jg $$0) {
      return this.a(ki.a($$0.u()), ki.a($$0.w())).b($$0);
   }

   @Override
   public ere b_(jg $$0) {
      return this.a(ki.a($$0.u()), ki.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jl $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public eqt z_() {
      return this.d.z_();
   }

   @Nullable
   @Override
   public dsg c_(jg $$0) {
      return this.a(ki.a($$0.u()), ki.a($$0.w())).a($$0);
   }

   private glf a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jg $$0, def $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   @Override
   public int J_() {
      return this.d.J_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$2 - $$0 + ($$3 - $$1) * 3;
   }
}
