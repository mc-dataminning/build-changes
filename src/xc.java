import javax.annotation.Nullable;

public class xc implements wu<wx> {
   public static final int a = 40;
   private final String b;
   private final String c;
   private final boolean d;
   @Nullable
   private final vb e;

   public xc(String $$0, String $$1, boolean $$2, @Nullable vb $$3) {
      if ($$1.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + $$1.length() + ")");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public xc(ue $$0) {
      this.b = $$0.s();
      this.c = $$0.d(40);
      this.d = $$0.readBoolean();
      this.e = $$0.c(ue::m);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ue::a);
   }

   public void a(wx $$0) {
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
   public vb f() {
      return this.e;
   }
}
