import javax.annotation.Nullable;

public class gke implements gln<gke> {
   public static final air a = new air("sounds", ".ogg");
   private final aiy b;
   private final blc c;
   private final blc d;
   private final int e;
   private final gke.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gke(String $$0, blc $$1, blc $$2, int $$3, gke.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new aiy($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aiy a() {
      return this.b;
   }

   public aiy b() {
      return a.a(this.b);
   }

   public blc c() {
      return this.c;
   }

   public blc d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gke a(awo $$0) {
      return this;
   }

   @Override
   public void a(gli $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gke.a f() {
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

      private a(String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static gke.a a(String $$0) {
         for (gke.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
