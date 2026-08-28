import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class hcz implements hdc<String> {
   public static final String a = "";
   private static final long c = TimeUnit.SECONDS.toMillis(1L);
   private static final Codec<TimeZone> d = Codec.STRING.comapFlatMap($$0 -> {
      TimeZone $$1 = TimeZone.getTimeZone($$0);
      return $$1.equals(TimeZone.UNKNOWN_ZONE) ? DataResult.error(() -> "Unknown timezone: " + $$0) : DataResult.success($$1);
   }, TimeZone::getID);
   public static final hdc.a<hcz, String> b = hdc.a.a(
      RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.fieldOf("pattern").forGetter($$0x -> $$0x.e),
                  Codec.STRING.optionalFieldOf("locale", "").forGetter($$0x -> $$0x.f),
                  d.optionalFieldOf("time_zone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, hcz::a)
      ),
      Codec.STRING
   );
   private final String e;
   private final String f;
   private final Optional<TimeZone> g;
   private final DateFormat h;
   private long i;
   private String j = "";

   private hcz(String $$0, Optional<TimeZone> $$1, String $$2, DateFormat $$3) {
      this.e = $$0;
      this.g = $$1;
      this.f = $$2;
      this.h = $$3;
   }

   public static hcz a(String $$0, String $$1, Optional<TimeZone> $$2) {
      ULocale $$3 = new ULocale($$1);
      Calendar $$4 = $$2.<Calendar>map($$1x -> Calendar.getInstance($$1x, $$3)).orElseGet(() -> Calendar.getInstance($$3));
      SimpleDateFormat $$5 = new SimpleDateFormat($$0, $$3);
      $$5.setCalendar($$4);
      return new hcz($$0, $$2, $$1, $$5);
   }

   @Nullable
   public String a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      long $$5 = af.c();
      if ($$5 > this.i) {
         this.j = this.b();
         this.i = $$5 + c;
      }

      return this.j;
   }

   private String b() {
      return this.h.format(new Date());
   }

   @Override
   public hdc.a<hcz, String> a() {
      return b;
   }
}
