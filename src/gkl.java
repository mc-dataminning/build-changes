import javax.annotation.Nullable;

public class gkl implements glu<gkl> {
   public static final air a = new air("sounds", ".ogg");
   private final aiy b;
   private final ble c;
   private final ble d;
   private final int e;
   private final gkl.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gkl(String $$0, ble $$1, ble $$2, int $$3, gkl.a $$4, boolean $$5, boolean $$6, int $$7) {
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

   public ble c() {
      return this.c;
   }

   public ble d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gkl a(awp $$0) {
      return this;
   }

   @Override
   public void a(glp $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gkl.a f() {
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
      public static gkl.a a(String $$0) {
         for (gkl.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
