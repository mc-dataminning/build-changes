import javax.annotation.Nullable;

public class gez implements ggi<gez> {
   public static final agb a = new agb("sounds", ".ogg");
   private final agi b;
   private final bif c;
   private final bif d;
   private final int e;
   private final gez.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gez(String $$0, bif $$1, bif $$2, int $$3, gez.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new agi($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public agi a() {
      return this.b;
   }

   public agi b() {
      return a.a(this.b);
   }

   public bif c() {
      return this.c;
   }

   public bif d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gez a(ats $$0) {
      return this;
   }

   @Override
   public void a(ggd $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gez.a f() {
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
      public static gez.a a(String $$0) {
         for (gez.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
