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

public record gsb<T>(String F, String G, Codec<T> H, gsb.a<T> I) {
   private static final DateTimeFormatter J = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
   public static final gsb<String> a = b("user_id", "userId");
   public static final gsb<String> b = b("client_id", "clientId");
   public static final gsb<UUID> c = e("minecraft_session_id", "deviceSessionId");
   public static final gsb<String> d = b("game_version", "buildDisplayName");
   public static final gsb<String> e = b("operating_system", "buildPlatform");
   public static final gsb<String> f = b("platform", "platform");
   public static final gsb<Boolean> g = a("client_modded", "clientModded");
   public static final gsb<String> h = b("launcher_name", "launcherName");
   public static final gsb<UUID> i = e("world_session_id", "worldSessionId");
   public static final gsb<Boolean> j = a("server_modded", "serverModded");
   public static final gsb<gsb.c> k = a("server_type", "serverType", gsb.c.d, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.c()));
   public static final gsb<Boolean> l = a("opt_in", "isOptional");
   public static final gsb<Instant> m = a("event_timestamp_utc", "eventTimestampUtc", axh.m, ($$0, $$1, $$2) -> $$0.addProperty($$1, J.format($$2)));
   public static final gsb<gsb.b> n = a("game_mode", "playerGameMode", gsb.b.f, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
   public static final gsb<String> o = b("realms_map_content", "realmsMapContent");
   public static final gsb<Integer> p = c("seconds_since_load", "secondsSinceLoad");
   public static final gsb<Integer> q = c("ticks_since_load", "ticksSinceLoad");
   public static final gsb<LongList> r = g("frame_rate_samples", "serializedFpsSamples");
   public static final gsb<LongList> s = g("render_time_samples", "serializedRenderTimeSamples");
   public static final gsb<LongList> t = g("used_memory_samples", "serializedUsedMemoryKbSamples");
   public static final gsb<Integer> u = c("number_of_samples", "numSamples");
   public static final gsb<Integer> v = c("render_distance", "renderDistance");
   public static final gsb<Integer> w = c("dedicated_memory_kb", "dedicatedMemoryKb");
   public static final gsb<Integer> x = c("world_load_time_ms", "worldLoadTimeMs");
   public static final gsb<Boolean> y = a("new_world", "newWorld");
   public static final gsb<gsf.a> z = f("load_time_total_time_ms", "loadTimeTotalTimeMs");
   public static final gsb<gsf.a> A = f("load_time_pre_window_ms", "loadTimePreWindowMs");
   public static final gsb<gsf.a> B = f("load_time_bootstrap_ms", "loadTimeBootstrapMs");
   public static final gsb<gsf.a> C = f("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
   public static final gsb<String> D = b("advancement_id", "advancementId");
   public static final gsb<Long> E = d("advancement_game_time", "advancementGameTime");

   public static <T> gsb<T> a(String $$0, String $$1, Codec<T> $$2, gsb.a<T> $$3) {
      return new gsb<>($$0, $$1, $$2, $$3);
   }

   public static gsb<Boolean> a(String $$0, String $$1) {
      return a($$0, $$1, Codec.BOOL, TelemetryPropertyContainer::addProperty);
   }

   public static gsb<String> b(String $$0, String $$1) {
      return a($$0, $$1, Codec.STRING, TelemetryPropertyContainer::addProperty);
   }

   public static gsb<Integer> c(String $$0, String $$1) {
      return a($$0, $$1, Codec.INT, TelemetryPropertyContainer::addProperty);
   }

   public static gsb<Long> d(String $$0, String $$1) {
      return a($$0, $$1, Codec.LONG, TelemetryPropertyContainer::addProperty);
   }

   public static gsb<UUID> e(String $$0, String $$1) {
      return a($$0, $$1, jq.d, ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.toString()));
   }

   public static gsb<gsf.a> f(String $$0, String $$1) {
      return a($$0, $$1, gsf.a.a, ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.a()));
   }

   public static gsb<LongList> g(String $$0, String $$1) {
      return a(
         $$0,
         $$1,
         Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()),
         ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";")))
      );
   }

   public void a(gsc $$0, TelemetryPropertyContainer $$1) {
      T $$2 = $$0.a(this);
      if ($$2 != null) {
         this.I.apply($$1, this.G, $$2);
      } else {
         $$1.addNullProperty(this.G);
      }
   }

   public xi a() {
      return wu.c("telemetry.property." + this.F + ".title");
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

   public gsb.a<T> e() {
      return this.I;
   }

   public interface a<T> {
      void apply(TelemetryPropertyContainer var1, String var2, T var3);
   }

   public static enum b implements ayt {
      a("survival", 0),
      b("creative", 1),
      c("adventure", 2),
      d("spectator", 6),
      e("hardcore", 99);

      public static final Codec<gsb.b> f = ayt.a(gsb.b::values);
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

   public static enum c implements ayt {
      a("realm"),
      b("local"),
      c("server");

      public static final Codec<gsb.c> d = ayt.a(gsb.c::values);
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
