import javax.annotation.Nullable;

public class gcl implements gdu<gcl> {
   public static final aer a = new aer("sounds", ".ogg");
   private final aey b;
   private final bgi c;
   private final bgi d;
   private final int e;
   private final gcl.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gcl(String $$0, bgi $$1, bgi $$2, int $$3, gcl.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new aey($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aey a() {
      return this.b;
   }

   public aey b() {
      return a.a(this.b);
   }

   public bgi c() {
      return this.c;
   }

   public bgi d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gcl a(ase $$0) {
      return this;
   }

   @Override
   public void a(gdp $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gcl.a f() {
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
      public static gcl.a a(String $$0) {
         for (gcl.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
