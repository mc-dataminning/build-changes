import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gnf {
   private final gnk a = new gnk();
   private final gnl b;
   private final gmx.a c;
   private final gmx.a d;
   private final gmz e;

   public gnf(int $$0) {
      this.b = gnl.a($$0);
      SequencedMap<gnh, fgo> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gns.h(), this.a.a(gnh.c()));
         $$0x.put(gns.i(), this.a.a(gnh.e()));
         $$0x.put(gns.a(), this.a.a(gnh.d()));
         $$0x.put(gns.j(), this.a.a(gnh.f()));
         a($$0x, gns.b());
         a($$0x, gns.c());
         a($$0x, gns.d());
         a($$0x, gns.e());
         a($$0x, gns.f());
         $$0x.put(gns.g(), new fgo(786432));
         a($$0x, gnh.j());
         a($$0x, gnh.l());
         a($$0x, gnh.k());
         a($$0x, gnh.m());
         a($$0x, gnh.i());
      });
      this.c = gmx.a($$1, new fgo(786432));
      this.e = new gmz(this.c);
      SequencedMap<gnh, fgo> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hib.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gmx.a($$2, new fgo(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gnh, fgo> $$0, gnh $$1) {
      $$0.put($$1, new fgo($$1.R()));
   }

   public gnk a() {
      return this.a;
   }

   public gnl b() {
      return this.b;
   }

   public gmx.a c() {
      return this.c;
   }

   public gmx.a d() {
      return this.d;
   }

   public gmz e() {
      return this.e;
   }
}
