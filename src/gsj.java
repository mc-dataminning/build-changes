import javax.annotation.Nullable;

public class gsj implements gtw<gsj> {
   public static final akx a = new akx("sounds", ".ogg");
   private final ale b;
   private final bqb c;
   private final bqb d;
   private final int e;
   private final gsj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gsj(String $$0, bqb $$1, bqb $$2, int $$3, gsj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ale($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ale a() {
      return this.b;
   }

   public ale b() {
      return a.a(this.b);
   }

   public bqb c() {
      return this.c;
   }

   public bqb d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gsj a(azg $$0) {
      return this;
   }

   @Override
   public void a(gtr $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gsj.a f() {
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
      public static gsj.a a(String $$0) {
         for (gsj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
