import javax.annotation.Nullable;

public class has implements hcc<has> {
   public static final akv a = new akv("sounds", ".ogg");
   private final alc b;
   private final bqx c;
   private final bqx d;
   private final int e;
   private final has.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public has(alc $$0, bqx $$1, bqx $$2, int $$3, has.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alc a() {
      return this.b;
   }

   public alc b() {
      return a.a(this.b);
   }

   public bqx c() {
      return this.c;
   }

   public bqx d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public has a(azl $$0) {
      return this;
   }

   @Override
   public void a(hbx $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public has.a f() {
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
      public static has.a a(String $$0) {
         for (has.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
