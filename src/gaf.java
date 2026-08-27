import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gaf {
   private final gak a = new gak();
   private final gal b;
   private final fzz.a c;
   private final fzz.a d;
   private final gaa e;

   public gaf(int $$0) {
      this.b = gal.a($$0);
      SortedMap<gah, ewd> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gao.h(), this.a.a(gah.c()));
         $$0x.put(gao.i(), this.a.a(gah.e()));
         $$0x.put(gao.a(), this.a.a(gah.d()));
         $$0x.put(gao.k(), this.a.a(gah.f()));
         a($$0x, gao.b());
         a($$0x, gao.c());
         a($$0x, gao.d());
         a($$0x, gao.e());
         a($$0x, gao.f());
         $$0x.put(gao.g(), new ewd(786432));
         a($$0x, gah.j());
         a($$0x, gah.k());
         a($$0x, gah.m());
         a($$0x, gah.n());
         a($$0x, gah.l());
         a($$0x, gah.o());
         a($$0x, gah.p());
         a($$0x, gah.i());
         gno.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fzz.a(new ewd(1536));
      this.c = fzz.a($$1, new ewd(786432));
      this.e = new gaa(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gah, ewd> $$0, gah $$1) {
      $$0.put($$1, new ewd($$1.I()));
   }

   public gak a() {
      return this.a;
   }

   public gal b() {
      return this.b;
   }

   public fzz.a c() {
      return this.c;
   }

   public fzz.a d() {
      return this.d;
   }

   public gaa e() {
      return this.e;
   }
}
