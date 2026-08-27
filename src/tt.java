import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record tt(ty d, @Nullable tp e, tw f, @Nullable te g, th h) {
   public static final MapCodec<tt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ty.a.fieldOf("link").forGetter(tt::j),
               tp.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               tw.a.forGetter(tt::l),
               aqw.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               th.a.optionalFieldOf("filter_mask", th.c).forGetter(tt::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new tt($$0x, (tp)$$1.orElse(null), $$2, (te)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.c;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static tt a(String $$0) {
      return a(i, $$0);
   }

   public static tt a(UUID $$0, String $$1) {
      tw $$2 = tw.a($$1);
      ty $$3 = ty.a($$0);
      return new tt($$3, null, $$2, null, th.c);
   }

   public tt a(te $$0) {
      te $$1 = !$$0.equals(te.b(this.b())) ? $$0 : null;
      return new tt(this.d, this.e, this.f, $$1, this.h);
   }

   public tt a() {
      return this.g != null ? new tt(this.d, this.e, this.f, null, this.h) : this;
   }

   public tt a(th $$0) {
      return this.h.equals($$0) ? this : new tt(this.d, this.e, this.f, this.g, $$0);
   }

   public tt a(boolean $$0) {
      return this.a($$0 ? this.h : th.c);
   }

   public static void a(arw.a $$0, ty $$1, tw $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(arx $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public te c() {
      return Objects.requireNonNullElseGet(this.g, () -> te.b(this.b()));
   }

   public Instant d() {
      return this.f.b();
   }

   public long e() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(c));
   }

   public UUID f() {
      return this.d.c();
   }

   public boolean g() {
      return this.f().equals(i);
   }

   public boolean h() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.h() && this.d.c().equals($$0);
   }

   public boolean i() {
      return this.h.b();
   }

   public ty j() {
      return this.d;
   }

   @Nullable
   public tp k() {
      return this.e;
   }

   public tw l() {
      return this.f;
   }

   @Nullable
   public te m() {
      return this.g;
   }

   public th n() {
      return this.h;
   }
}
