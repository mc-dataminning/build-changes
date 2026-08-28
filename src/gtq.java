import javax.annotation.Nullable;

public class gtq implements gva<gtq> {
   public static final akj a = new akj("sounds", ".ogg");
   private final akq b;
   private final bpy c;
   private final bpy d;
   private final int e;
   private final gtq.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gtq(akq $$0, bpy $$1, bpy $$2, int $$3, gtq.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akq a() {
      return this.b;
   }

   public akq b() {
      return a.a(this.b);
   }

   public bpy c() {
      return this.c;
   }

   public bpy d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gtq a(ayv $$0) {
      return this;
   }

   @Override
   public void a(guv $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gtq.a f() {
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
      public static gtq.a a(String $$0) {
         for (gtq.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
