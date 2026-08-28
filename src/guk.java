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

public class guk {
   static final Map<String, guk> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<guk> a = Codec.STRING.comapFlatMap($$0 -> {
      guk $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, guk::a);
   private static final List<gum<?>> i = List.of(gum.a, gum.b, gum.c, gum.d, gum.e, gum.f, gum.g, gum.h, gum.m, gum.l);
   private static final List<gum<?>> j = Stream.concat(i.stream(), Stream.of(gum.i, gum.j, gum.k)).toList();
   public static final guk b = a("world_loaded", "WorldLoaded").a(j).a(gum.n).a(gum.o).b();
   public static final guk c = a("performance_metrics", "PerformanceMetrics").a(j).a(gum.r).a(gum.s).a(gum.t).a(gum.u).a(gum.v).a(gum.w).a().b();
   public static final guk d = a("world_load_times", "WorldLoadTimes").a(j).a(gum.x).a(gum.y).a().b();
   public static final guk e = a("world_unloaded", "WorldUnloaded").a(j).a(gum.p).a(gum.q).b();
   public static final guk f = a("advancement_made", "AdvancementMade").a(j).a(gum.D).a(gum.E).a().b();
   public static final guk g = a("game_load_times", "GameLoadTimes").a(i).a(gum.z).a(gum.A).a(gum.B).a(gum.C).a().b();
   private final String k;
   private final String l;
   private final List<gum<?>> m;
   private final boolean n;
   private final MapCodec<gug> o;

   guk(String $$0, String $$1, List<gum<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gun.a($$2).xmap($$0x -> new gug(this, $$0x), gug::b);
   }

   public static guk.a a(String $$0, String $$1) {
      return new guk.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gum<?>> b() {
      return this.m;
   }

   public MapCodec<gug> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gun $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gum<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gum<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xi e() {
      return this.a("title");
   }

   public xi f() {
      return this.a("description");
   }

   private xi a(String $$0) {
      return wu.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<guk> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gum<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public guk.a a(List<gum<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> guk.a a(gum<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public guk.a a() {
         this.d = true;
         return this;
      }

      public guk b() {
         guk $$0 = new guk(this.a, this.b, List.copyOf(this.c), this.d);
         if (guk.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
