import javax.annotation.Nullable;

public class gmj implements gns<gmj> {
   public static final aja a = new aja("sounds", ".ogg");
   private final ajh b;
   private final bmk c;
   private final bmk d;
   private final int e;
   private final gmj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gmj(String $$0, bmk $$1, bmk $$2, int $$3, gmj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ajh($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ajh a() {
      return this.b;
   }

   public ajh b() {
      return a.a(this.b);
   }

   public bmk c() {
      return this.c;
   }

   public bmk d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gmj a(axd $$0) {
      return this;
   }

   @Override
   public void a(gnn $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gmj.a f() {
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
      public static gmj.a a(String $$0) {
         for (gmj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
