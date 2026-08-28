import javax.annotation.Nullable;

public class hab implements hbl<hab> {
   public static final aku a = new aku("sounds", ".ogg");
   private final alb b;
   private final bqs c;
   private final bqs d;
   private final int e;
   private final hab.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hab(alb $$0, bqs $$1, bqs $$2, int $$3, hab.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
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

   public bqs c() {
      return this.c;
   }

   public bqs d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hab a(azk $$0) {
      return this;
   }

   @Override
   public void a(hbg $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hab.a f() {
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
      public static hab.a a(String $$0) {
         for (hab.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
