public class gdt extends gcx {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gfe e;
   private final gfe f;

   public gdt(gfe $$0) {
      super($$0, gmj::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("plate", gfj.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gfg.a);
      $$1.a("handle", gfj.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gfg.a);
      return gfk.a($$0, 64, 64);
   }

   public gfe b() {
      return this.e;
   }

   public gfe c() {
      return this.f;
   }
}
