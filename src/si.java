import javax.annotation.Nullable;

public class si extends sh {
   private final iu c;
   private final iu d;

   public si(wy $$0, iu $$1, iu $$2, int $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public wy a() {
      return wy.a("test.error.position", this.a, this.c.u(), this.c.v(), this.c.w(), this.d.u(), this.d.v(), this.d.w(), this.b);
   }

   @Nullable
   public String b() {
      return super.getMessage();
   }

   @Nullable
   public iu c() {
      return this.d;
   }

   @Nullable
   public iu d() {
      return this.c;
   }
}
