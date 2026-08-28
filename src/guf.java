import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class guf {
   static final Map<String, guf> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<guf> a = Codec.STRING.comapFlatMap($$0 -> {
      guf $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, guf::a);
   private static final List<guh<?>> i = List.of(guh.a, guh.b, guh.c, guh.d, guh.e, guh.f, guh.g, guh.h, guh.m, guh.l);
   private static final List<guh<?>> j = Stream.concat(i.stream(), Stream.of(guh.i, guh.j, guh.k)).toList();
   public static final guf b = a("world_loaded", "WorldLoaded").a(j).a(guh.n).a(guh.o).b();
   public static final guf c = a("performance_metrics", "PerformanceMetrics").a(j).a(guh.r).a(guh.s).a(guh.t).a(guh.u).a(guh.v).a(guh.w).a().b();
   public static final guf d = a("world_load_times", "WorldLoadTimes").a(j).a(guh.x).a(guh.y).a().b();
   public static final guf e = a("world_unloaded", "WorldUnloaded").a(j).a(guh.p).a(guh.q).b();
   public static final guf f = a("advancement_made", "AdvancementMade").a(j).a(guh.D).a(guh.E).a().b();
   public static final guf g = a("game_load_times", "GameLoadTimes").a(i).a(guh.z).a(guh.A).a(guh.B).a(guh.C).a().b();
   private final String k;
   private final String l;
   private final List<guh<?>> m;
   private final boolean n;
   private final MapCodec<gub> o;

   guf(String $$0, String $$1, List<guh<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gui.a($$2).xmap($$0x -> new gub(this, $$0x), gub::b);
   }

   public static guf.a a(String $$0, String $$1) {
      return new guf.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<guh<?>> b() {
      return this.m;
   }

   public MapCodec<gub> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gui $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (guh<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(guh<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yd e() {
      return this.a("title");
   }

   public yd f() {
      return this.a("description");
   }

   private yd a(String $$0) {
      return xp.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<guf> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<guh<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public guf.a a(List<guh<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> guf.a a(guh<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public guf.a a() {
         this.d = true;
         return this;
      }

      public guf b() {
         guf $$0 = new guf(this.a, this.b, List.copyOf(this.c), this.d);
         if (guf.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
