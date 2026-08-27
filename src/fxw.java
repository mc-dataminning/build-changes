import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fxw {
   private final fyb a = new fyb();
   private final fyc b;
   private final fxq.a c;
   private final fxq.a d;
   private final fxr e;

   public fxw(int $$0) {
      this.b = fyc.a($$0);
      SortedMap<fxy, etu> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fyf.h(), this.a.a(fxy.c()));
         $$0x.put(fyf.i(), this.a.a(fxy.e()));
         $$0x.put(fyf.a(), this.a.a(fxy.d()));
         $$0x.put(fyf.k(), this.a.a(fxy.f()));
         a($$0x, fyf.b());
         a($$0x, fyf.c());
         a($$0x, fyf.d());
         a($$0x, fyf.e());
         a($$0x, fyf.f());
         $$0x.put(fyf.g(), new etu(786432));
         a($$0x, fxy.j());
         a($$0x, fxy.k());
         a($$0x, fxy.m());
         a($$0x, fxy.n());
         a($$0x, fxy.l());
         a($$0x, fxy.o());
         a($$0x, fxy.p());
         a($$0x, fxy.i());
         gle.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fxq.a(new etu(1536));
      this.c = fxq.a($$1, new etu(786432));
      this.e = new fxr(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fxy, etu> $$0, fxy $$1) {
      $$0.put($$1, new etu($$1.I()));
   }

   public fyb a() {
      return this.a;
   }

   public fyc b() {
      return this.b;
   }

   public fxq.a c() {
      return this.c;
   }

   public fxq.a d() {
      return this.d;
   }

   public fxr e() {
      return this.e;
   }
}
