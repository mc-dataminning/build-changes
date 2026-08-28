import javax.annotation.Nullable;

public class gmh implements deh {
   public static final int a = 1;
   public static final int b = 3;
   private final int e;
   private final int f;
   protected final gmg[] c;
   protected final dff d;

   gmh(dff $$0, int $$1, int $$2, gmg[] $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.c = $$3;
   }

   @Override
   public dvo a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0);
   }

   @Override
   public ero b_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return this.d.a($$0, $$1);
   }

   @Override
   public erd z_() {
      return this.d.z_();
   }

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a($$0);
   }

   private gmg a(int $$0, int $$1) {
      return this.c[a(this.e, this.f, $$0, $$1)];
   }

   @Override
   public int a(jh $$0, dep $$1) {
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
