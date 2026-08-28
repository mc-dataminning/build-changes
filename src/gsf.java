import javax.annotation.Nullable;

public class gsf implements gts<gsf> {
   public static final aku a = new aku("sounds", ".ogg");
   private final alb b;
   private final bpx c;
   private final bpx d;
   private final int e;
   private final gsf.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gsf(String $$0, bpx $$1, bpx $$2, int $$3, gsf.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new alb($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alb a() {
      return this.b;
   }

   public alb b() {
      return a.a(this.b);
   }

   public bpx c() {
      return this.c;
   }

   public bpx d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gsf a(azc $$0) {
      return this;
   }

   @Override
   public void a(gtn $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gsf.a f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public int i() {
      return this.i;
   }

   @Override
   public String toString() {
      return "Sound[" + this.b + "]";
   }

   public static enum a {
      a("file"),
      b("event");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static gsf.a a(String $$0) {
         for (gsf.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
