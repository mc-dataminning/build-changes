import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gqi {
   private final gqn a = new gqn();
   private final gqo b;
   private final gqa.a c;
   private final gqa.a d;
   private final gqc e;

   public gqi(int $$0) {
      this.b = gqo.a($$0);
      SequencedMap<gqk, fjg> $$1 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gqv.h(), this.a.a(gqk.c()));
         $$0x.put(gqv.i(), this.a.a(gqk.e()));
         $$0x.put(gqv.a(), this.a.a(gqk.d()));
         $$0x.put(gqv.j(), this.a.a(gqk.f()));
         a($$0x, gqv.b());
         a($$0x, gqv.c());
         a($$0x, gqv.d());
         a($$0x, gqv.e());
         a($$0x, gqv.f());
         $$0x.put(gqv.g(), new fjg(786432));
         a($$0x, gqk.j());
         a($$0x, gqk.l());
         a($$0x, gqk.k());
         a($$0x, gqk.m());
         a($$0x, gqk.i());
      });
      this.c = gqa.a($$1, new fjg(786432));
      this.e = new gqc(this.c);
      SequencedMap<gqk, fjg> $$2 = af.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hlh.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gqa.a($$2, new fjg(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gqk, fjg> $$0, gqk $$1) {
      $$0.put($$1, new fjg($$1.S()));
   }

   public gqn a() {
      return this.a;
   }

   public gqo b() {
      return this.b;
   }

   public gqa.a c() {
      return this.c;
   }

   public gqa.a d() {
      return this.d;
   }

   public gqc e() {
      return this.e;
   }
}
