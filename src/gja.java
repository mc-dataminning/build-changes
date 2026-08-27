import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gja {
   static final Map<String, gja> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gja> a = Codec.STRING.comapFlatMap($$0 -> {
      gja $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gja::a);
   private static final List<gjc<?>> i = List.of(gjc.a, gjc.b, gjc.c, gjc.d, gjc.e, gjc.f, gjc.g, gjc.h, gjc.m, gjc.l);
   private static final List<gjc<?>> j = Stream.concat(i.stream(), Stream.of(gjc.i, gjc.j, gjc.k)).toList();
   public static final gja b = a("world_loaded", "WorldLoaded").a(j).a(gjc.n).a(gjc.o).b();
   public static final gja c = a("performance_metrics", "PerformanceMetrics").a(j).a(gjc.r).a(gjc.s).a(gjc.t).a(gjc.u).a(gjc.v).a(gjc.w).a().b();
   public static final gja d = a("world_load_times", "WorldLoadTimes").a(j).a(gjc.x).a(gjc.y).a().b();
   public static final gja e = a("world_unloaded", "WorldUnloaded").a(j).a(gjc.p).a(gjc.q).b();
   public static final gja f = a("advancement_made", "AdvancementMade").a(j).a(gjc.D).a(gjc.E).a().b();
   public static final gja g = a("game_load_times", "GameLoadTimes").a(i).a(gjc.z).a(gjc.A).a(gjc.B).a(gjc.C).a().b();
   private final String k;
   private final String l;
   private final List<gjc<?>> m;
   private final boolean n;
   private final Codec<giw> o;

   gja(String $$0, String $$1, List<gjc<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gjd.a($$2).xmap($$0x -> new giw(this, $$0x), giw::b);
   }

   public static gja.a a(String $$0, String $$1) {
      return new gja.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gjc<?>> b() {
      return this.m;
   }

   public Codec<giw> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gjd $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gjc<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gjc<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vr e() {
      return this.a("title");
   }

   public vr f() {
      return this.a("description");
   }

   private vr a(String $$0) {
      return vd.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gja> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gjc<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gja.a a(List<gjc<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gja.a a(gjc<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gja.a a() {
         this.d = true;
         return this;
      }

      public gja b() {
         gja $$0 = new gja(this.a, this.b, List.copyOf(this.c), this.d);
         if (gja.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
