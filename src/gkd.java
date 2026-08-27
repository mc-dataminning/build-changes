import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public record gkd<T>(String F, String G, Codec<T> H, gkd.a<T> I) {
   private static final DateTimeFormatter J = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
   public static final gkd<String> a = b("user_id", "userId");
   public static final gkd<String> b = b("client_id", "clientId");
   public static final gkd<UUID> c = e("minecraft_session_id", "deviceSessionId");
   public static final gkd<String> d = b("game_version", "buildDisplayName");
   public static final gkd<String> e = b("operating_system", "buildPlatform");
   public static final gkd<String> f = b("platform", "platform");
   public static final gkd<Boolean> g = a("client_modded", "clientModded");
   public static final gkd<String> h = b("launcher_name", "launcherName");
   public static final gkd<UUID> i = e("world_session_id", "worldSessionId");
   public static final gkd<Boolean> j = a("server_modded", "serverModded");
   public static final gkd<gkd.c> k = a("server_type", "serverType", gkd.c.d, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.c()));
   public static final gkd<Boolean> l = a("opt_in", "isOptional");
   public static final gkd<Instant> m = a("event_timestamp_utc", "eventTimestampUtc", atx.m, ($$0, $$1, $$2) -> $$0.addProperty($$1, J.format($$2)));
   public static final gkd<gkd.b> n = a("game_mode", "playerGameMode", gkd.b.f, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
   public static final gkd<String> o = b("realms_map_content", "realmsMapContent");
   public static final gkd<Integer> p = c("seconds_since_load", "secondsSinceLoad");
   public static final gkd<Integer> q = c("ticks_since_load", "ticksSinceLoad");
   public static final gkd<LongList> r = g("frame_rate_samples", "serializedFpsSamples");
   public static final gkd<LongList> s = g("render_time_samples", "serializedRenderTimeSamples");
   public static final gkd<LongList> t = g("used_memory_samples", "serializedUsedMemoryKbSamples");
   public static final gkd<Integer> u = c("number_of_samples", "numSamples");
   public static final gkd<Integer> v = c("render_distance", "renderDistance");
   public static final gkd<Integer> w = c("dedicated_memory_kb", "dedicatedMemoryKb");
   public static final gkd<Integer> x = c("world_load_time_ms", "worldLoadTimeMs");
   public static final gkd<Boolean> y = a("new_world", "newWorld");
   public static final gkd<gkh.a> z = f("load_time_total_time_ms", "loadTimeTotalTimeMs");
   public static final gkd<gkh.a> A = f("load_time_pre_window_ms", "loadTimePreWindowMs");
   public static final gkd<gkh.a> B = f("load_time_bootstrap_ms", "loadTimeBootstrapMs");
   public static final gkd<gkh.a> C = f("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
   public static final gkd<String> D = b("advancement_id", "advancementId");
   public static final gkd<Long> E = d("advancement_game_time", "advancementGameTime");

   public static <T> gkd<T> a(String $$0, String $$1, Codec<T> $$2, gkd.a<T> $$3) {
      return new gkd<>($$0, $$1, $$2, $$3);
   }

   public static gkd<Boolean> a(String $$0, String $$1) {
      return a($$0, $$1, Codec.BOOL, TelemetryPropertyContainer::addProperty);
   }

   public static gkd<String> b(String $$0, String $$1) {
      return a($$0, $$1, Codec.STRING, TelemetryPropertyContainer::addProperty);
   }

   public static gkd<Integer> c(String $$0, String $$1) {
      return a($$0, $$1, Codec.INT, TelemetryPropertyContainer::addProperty);
   }

   public static gkd<Long> d(String $$0, String $$1) {
      return a($$0, $$1, Codec.LONG, TelemetryPropertyContainer::addProperty);
   }

   public static gkd<UUID> e(String $$0, String $$1) {
      return a($$0, $$1, ja.c, ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.toString()));
   }

   public static gkd<gkh.a> f(String $$0, String $$1) {
      return a($$0, $$1, gkh.a.a, ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.a()));
   }

   public static gkd<LongList> g(String $$0, String $$1) {
      return a(
         $$0,
         $$1,
         Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()),
         ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";")))
      );
   }

   public void a(gke $$0, TelemetryPropertyContainer $$1) {
      T $$2 = $$0.a(this);
      if ($$2 != null) {
         this.I.apply($$1, this.G, $$2);
      } else {
         $$1.addNullProperty(this.G);
      }
   }

   public vu a() {
      return vg.c("telemetry.property." + this.F + ".title");
   }

   @Override
   public String toString() {
      return "TelemetryProperty[" + this.F + "]";
   }

   public String b() {
      return this.F;
   }

   public String c() {
      return this.G;
   }

   public Codec<T> d() {
      return this.H;
   }

   public gkd.a<T> e() {
      return this.I;
   }

   public interface a<T> {
      void apply(TelemetryPropertyContainer var1, String var2, T var3);
   }

   public static enum b implements avl {
      a("survival", 0),
      b("creative", 1),
      c("adventure", 2),
      d("spectator", 6),
      e("hardcore", 99);

      public static final Codec<gkd.b> f = avl.a(gkd.b::values);
      private final String g;
      private final int h;

      private b(String $$0, int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum c implements avl {
      a("realm"),
      b("local"),
      c("server");

      public static final Codec<gkd.c> d = avl.a(gkd.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
