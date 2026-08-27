import javax.annotation.Nullable;

public class wj implements wb<we> {
   public static final int a = 40;
   private final String b;
   private final String c;
   private final boolean d;
   @Nullable
   private final ui e;

   public wj(String $$0, String $$1, boolean $$2, @Nullable ui $$3) {
      if ($$1.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + $$1.length() + ")");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public wj(tl $$0) {
      this.b = $$0.s();
      this.c = $$0.d(40);
      this.d = $$0.readBoolean();
      this.e = $$0.c(tl::m);
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e, tl::a);
   }

   public void a(we $$0) {
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
   public ui f() {
      return this.e;
   }
}
