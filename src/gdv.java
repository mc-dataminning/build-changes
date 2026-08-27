import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gdv {
   static final Map<String, gdv> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gdv> a = Codec.STRING.comapFlatMap($$0 -> {
      gdv $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gdv::a);
   private static final List<gdx<?>> i = List.of(gdx.a, gdx.b, gdx.c, gdx.d, gdx.e, gdx.f, gdx.g, gdx.h, gdx.m, gdx.l);
   private static final List<gdx<?>> j = Stream.concat(i.stream(), Stream.of(gdx.i, gdx.j, gdx.k)).toList();
   public static final gdv b = a("world_loaded", "WorldLoaded").a(j).a(gdx.n).a(gdx.o).b();
   public static final gdv c = a("performance_metrics", "PerformanceMetrics").a(j).a(gdx.r).a(gdx.s).a(gdx.t).a(gdx.u).a(gdx.v).a(gdx.w).a().b();
   public static final gdv d = a("world_load_times", "WorldLoadTimes").a(j).a(gdx.x).a(gdx.y).a().b();
   public static final gdv e = a("world_unloaded", "WorldUnloaded").a(j).a(gdx.p).a(gdx.q).b();
   public static final gdv f = a("advancement_made", "AdvancementMade").a(j).a(gdx.D).a(gdx.E).a().b();
   public static final gdv g = a("game_load_times", "GameLoadTimes").a(i).a(gdx.z).a(gdx.A).a(gdx.B).a(gdx.C).a().b();
   private final String k;
   private final String l;
   private final List<gdx<?>> m;
   private final boolean n;
   private final Codec<gdr> o;

   gdv(String $$0, String $$1, List<gdx<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gdy.a($$2).xmap($$0x -> new gdr(this, $$0x), gdr::b);
   }

   public static gdv.a a(String $$0, String $$1) {
      return new gdv.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gdx<?>> b() {
      return this.m;
   }

   public Codec<gdr> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gdy $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gdx<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gdx<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public tz e() {
      return this.a("title");
   }

   public tz f() {
      return this.a("description");
   }

   private tz a(String $$0) {
      return tl.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gdv> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gdx<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gdv.a a(List<gdx<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gdv.a a(gdx<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gdv.a a() {
         this.d = true;
         return this;
      }

      public gdv b() {
         gdv $$0 = new gdv(this.a, this.b, List.copyOf(this.c), this.d);
         if (gdv.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
