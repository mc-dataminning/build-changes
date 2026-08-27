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

public class gsw {
   static final Map<String, gsw> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gsw> a = Codec.STRING.comapFlatMap($$0 -> {
      gsw $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gsw::a);
   private static final List<gsy<?>> i = List.of(gsy.a, gsy.b, gsy.c, gsy.d, gsy.e, gsy.f, gsy.g, gsy.h, gsy.m, gsy.l);
   private static final List<gsy<?>> j = Stream.concat(i.stream(), Stream.of(gsy.i, gsy.j, gsy.k)).toList();
   public static final gsw b = a("world_loaded", "WorldLoaded").a(j).a(gsy.n).a(gsy.o).b();
   public static final gsw c = a("performance_metrics", "PerformanceMetrics").a(j).a(gsy.r).a(gsy.s).a(gsy.t).a(gsy.u).a(gsy.v).a(gsy.w).a().b();
   public static final gsw d = a("world_load_times", "WorldLoadTimes").a(j).a(gsy.x).a(gsy.y).a().b();
   public static final gsw e = a("world_unloaded", "WorldUnloaded").a(j).a(gsy.p).a(gsy.q).b();
   public static final gsw f = a("advancement_made", "AdvancementMade").a(j).a(gsy.D).a(gsy.E).a().b();
   public static final gsw g = a("game_load_times", "GameLoadTimes").a(i).a(gsy.z).a(gsy.A).a(gsy.B).a(gsy.C).a().b();
   private final String k;
   private final String l;
   private final List<gsy<?>> m;
   private final boolean n;
   private final MapCodec<gss> o;

   gsw(String $$0, String $$1, List<gsy<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gsz.a($$2).xmap($$0x -> new gss(this, $$0x), gss::b);
   }

   public static gsw.a a(String $$0, String $$1) {
      return new gsw.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gsy<?>> b() {
      return this.m;
   }

   public MapCodec<gss> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gsz $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gsy<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gsy<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xl e() {
      return this.a("title");
   }

   public xl f() {
      return this.a("description");
   }

   private xl a(String $$0) {
      return wx.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gsw> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gsy<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gsw.a a(List<gsy<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gsw.a a(gsy<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gsw.a a() {
         this.d = true;
         return this;
      }

      public gsw b() {
         gsw $$0 = new gsw(this.a, this.b, List.copyOf(this.c), this.d);
         if (gsw.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
