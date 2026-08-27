import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fww {
   private final fxb a = new fxb();
   private final fxc b;
   private final fwq.a c;
   private final fwq.a d;
   private final fwr e;

   public fww(int $$0) {
      this.b = fxc.a($$0);
      SortedMap<fwy, esy> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fxf.h(), this.a.a(fwy.c()));
         $$0x.put(fxf.i(), this.a.a(fwy.e()));
         $$0x.put(fxf.a(), this.a.a(fwy.d()));
         $$0x.put(fxf.k(), this.a.a(fwy.f()));
         a($$0x, fxf.b());
         a($$0x, fxf.c());
         a($$0x, fxf.d());
         a($$0x, fxf.e());
         a($$0x, fxf.f());
         $$0x.put(fxf.g(), new esy(786432));
         a($$0x, fwy.j());
         a($$0x, fwy.k());
         a($$0x, fwy.m());
         a($$0x, fwy.n());
         a($$0x, fwy.l());
         a($$0x, fwy.o());
         a($$0x, fwy.p());
         a($$0x, fwy.i());
         gke.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fwq.a(new esy(1536));
      this.c = fwq.a($$1, new esy(786432));
      this.e = new fwr(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fwy, esy> $$0, fwy $$1) {
      $$0.put($$1, new esy($$1.I()));
   }

   public fxb a() {
      return this.a;
   }

   public fxc b() {
      return this.b;
   }

   public fwq.a c() {
      return this.c;
   }

   public fwq.a d() {
      return this.d;
   }

   public fwr e() {
      return this.e;
   }
}
