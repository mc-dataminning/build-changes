import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fxy {
   private final fyd a = new fyd();
   private final fye b;
   private final fxs.a c;
   private final fxs.a d;
   private final fxt e;

   public fxy(int $$0) {
      this.b = fye.a($$0);
      SortedMap<fya, etw> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fyh.h(), this.a.a(fya.c()));
         $$0x.put(fyh.i(), this.a.a(fya.e()));
         $$0x.put(fyh.a(), this.a.a(fya.d()));
         $$0x.put(fyh.k(), this.a.a(fya.f()));
         a($$0x, fyh.b());
         a($$0x, fyh.c());
         a($$0x, fyh.d());
         a($$0x, fyh.e());
         a($$0x, fyh.f());
         $$0x.put(fyh.g(), new etw(786432));
         a($$0x, fya.j());
         a($$0x, fya.k());
         a($$0x, fya.m());
         a($$0x, fya.n());
         a($$0x, fya.l());
         a($$0x, fya.o());
         a($$0x, fya.p());
         a($$0x, fya.i());
         glh.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fxs.a(new etw(1536));
      this.c = fxs.a($$1, new etw(786432));
      this.e = new fxt(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fya, etw> $$0, fya $$1) {
      $$0.put($$1, new etw($$1.I()));
   }

   public fyd a() {
      return this.a;
   }

   public fye b() {
      return this.b;
   }

   public fxs.a c() {
      return this.c;
   }

   public fxs.a d() {
      return this.d;
   }

   public fxt e() {
      return this.e;
   }
}
