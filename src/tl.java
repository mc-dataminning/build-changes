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

public record tl(tq d, @Nullable th e, to f, @Nullable sw g, sz h) {
   public static final MapCodec<tl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               tq.a.fieldOf("link").forGetter(tl::j),
               th.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               to.a.forGetter(tl::l),
               aoi.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               sz.a.optionalFieldOf("filter_mask", sz.c).forGetter(tl::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new tl($$0x, (th)$$1.orElse(null), $$2, (sw)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.c;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static tl a(String $$0) {
      return a(i, $$0);
   }

   public static tl a(UUID $$0, String $$1) {
      to $$2 = to.a($$1);
      tq $$3 = tq.a($$0);
      return new tl($$3, null, $$2, null, sz.c);
   }

   public tl a(sw $$0) {
      sw $$1 = !$$0.equals(sw.b(this.b())) ? $$0 : null;
      return new tl(this.d, this.e, this.f, $$1, this.h);
   }

   public tl a() {
      return this.g != null ? new tl(this.d, this.e, this.f, null, this.h) : this;
   }

   public tl a(sz $$0) {
      return this.h.equals($$0) ? this : new tl(this.d, this.e, this.f, this.g, $$0);
   }

   public tl a(boolean $$0) {
      return this.a($$0 ? this.h : sz.c);
   }

   public static void a(api.a $$0, tq $$1, to $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(apj $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public sw c() {
      return Objects.requireNonNullElseGet(this.g, () -> sw.b(this.b()));
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

   public tq j() {
      return this.d;
   }

   @Nullable
   public th k() {
      return this.e;
   }

   public to l() {
      return this.f;
   }

   @Nullable
   public sw m() {
      return this.g;
   }

   public sz n() {
      return this.h;
   }
}
