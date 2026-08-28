import javax.annotation.Nullable;

public class sh extends sg {
   private final jj c;
   private final jj d;

   public sh(wv $$0, jj $$1, jj $$2, int $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public wv a() {
      return wv.a("test.error.position", this.a, this.c.u(), this.c.v(), this.c.w(), this.d.u(), this.d.v(), this.d.w(), this.b);
   }

   @Nullable
   public String b() {
      return super.getMessage();
   }

   @Nullable
   public jj c() {
      return this.d;
   }

   @Nullable
   public jj d() {
      return this.c;
   }
}
