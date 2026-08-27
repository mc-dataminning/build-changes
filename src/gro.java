import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gro {
   static final Map<String, gro> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gro> a = Codec.STRING.comapFlatMap($$0 -> {
      gro $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gro::a);
   private static final List<grq<?>> i = List.of(grq.a, grq.b, grq.c, grq.d, grq.e, grq.f, grq.g, grq.h, grq.m, grq.l);
   private static final List<grq<?>> j = Stream.concat(i.stream(), Stream.of(grq.i, grq.j, grq.k)).toList();
   public static final gro b = a("world_loaded", "WorldLoaded").a(j).a(grq.n).a(grq.o).b();
   public static final gro c = a("performance_metrics", "PerformanceMetrics").a(j).a(grq.r).a(grq.s).a(grq.t).a(grq.u).a(grq.v).a(grq.w).a().b();
   public static final gro d = a("world_load_times", "WorldLoadTimes").a(j).a(grq.x).a(grq.y).a().b();
   public static final gro e = a("world_unloaded", "WorldUnloaded").a(j).a(grq.p).a(grq.q).b();
   public static final gro f = a("advancement_made", "AdvancementMade").a(j).a(grq.D).a(grq.E).a().b();
   public static final gro g = a("game_load_times", "GameLoadTimes").a(i).a(grq.z).a(grq.A).a(grq.B).a(grq.C).a().b();
   private final String k;
   private final String l;
   private final List<grq<?>> m;
   private final boolean n;
   private final Codec<grk> o;

   gro(String $$0, String $$1, List<grq<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = grr.a($$2).xmap($$0x -> new grk(this, $$0x), grk::b);
   }

   public static gro.a a(String $$0, String $$1) {
      return new gro.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<grq<?>> b() {
      return this.m;
   }

   public Codec<grk> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, grr $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (grq<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(grq<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xg e() {
      return this.a("title");
   }

   public xg f() {
      return this.a("description");
   }

   private xg a(String $$0) {
      return ws.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gro> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<grq<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gro.a a(List<grq<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gro.a a(grq<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gro.a a() {
         this.d = true;
         return this;
      }

      public gro b() {
         gro $$0 = new gro(this.a, this.b, List.copyOf(this.c), this.d);
         if (gro.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
