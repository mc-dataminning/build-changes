import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gff {
   private final gfk a = new gfk();
   private final gfl b;
   private final gez.a c;
   private final gez.a d;
   private final gfa e;

   public gff(int $$0) {
      this.b = gfl.a($$0);
      SequencedMap<gfh, fbf> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gfo.h(), this.a.a(gfh.c()));
         $$0x.put(gfo.i(), this.a.a(gfh.e()));
         $$0x.put(gfo.a(), this.a.a(gfh.d()));
         $$0x.put(gfo.k(), this.a.a(gfh.f()));
         a($$0x, gfo.b());
         a($$0x, gfo.c());
         a($$0x, gfo.d());
         a($$0x, gfo.e());
         a($$0x, gfo.f());
         $$0x.put(gfo.g(), new fbf(786432));
         a($$0x, gfh.j());
         a($$0x, gfh.l());
         a($$0x, gfh.k());
         a($$0x, gfh.m());
         a($$0x, gfh.n());
         a($$0x, gfh.i());
         gss.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gez.a(new fbf(1536));
      this.c = gez.a($$1, new fbf(786432));
      this.e = new gfa(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gfh, fbf> $$0, gfh $$1) {
      $$0.put($$1, new fbf($$1.J()));
   }

   public gfk a() {
      return this.a;
   }

   public gfl b() {
      return this.b;
   }

   public gez.a c() {
      return this.c;
   }

   public gez.a d() {
      return this.d;
   }

   public gfa e() {
      return this.e;
   }
}
