import javax.annotation.Nullable;

public class vf implements ux<va> {
   public static final int a = 40;
   private final String b;
   private final String c;
   private final boolean d;
   @Nullable
   private final tf e;

   public vf(String $$0, String $$1, boolean $$2, @Nullable tf $$3) {
      if ($$1.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + $$1.length() + ")");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public vf(si $$0) {
      this.b = $$0.r();
      this.c = $$0.d(40);
      this.d = $$0.readBoolean();
      this.e = $$0.c(si::l);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e, si::a);
   }

   public void a(va $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }

   @Nullable
   public tf f() {
      return this.e;
   }
}
