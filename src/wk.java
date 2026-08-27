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

public record wk(wp d, @Nullable wg e, wn f, @Nullable vu g, vy h) {
   public static final MapCodec<wk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               wp.a.fieldOf("link").forGetter(wk::k),
               wg.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               wn.a.forGetter(wk::m),
               vw.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vy.a.optionalFieldOf("filter_mask", vy.c).forGetter(wk::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new wk($$0x, (wg)$$1.orElse(null), $$2, (vu)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static wk a(String $$0) {
      return a(i, $$0);
   }

   public static wk a(UUID $$0, String $$1) {
      wn $$2 = wn.a($$1);
      wp $$3 = wp.a($$0);
      return new wk($$3, null, $$2, null, vy.c);
   }

   public wk a(vu $$0) {
      vu $$1 = !$$0.equals(vu.b(this.c())) ? $$0 : null;
      return new wk(this.d, this.e, this.f, $$1, this.h);
   }

   public wk a() {
      return this.g != null ? new wk(this.d, this.e, this.f, null, this.h) : this;
   }

   public wk a(vy $$0) {
      return this.h.equals($$0) ? this : new wk(this.d, this.e, this.f, this.g, $$0);
   }

   public wk a(boolean $$0) {
      return this.a($$0 ? this.h : vy.c);
   }

   public wk b() {
      wn $$0 = wn.a(this.c());
      wp $$1 = wp.a(this.g());
      return new wk($$1, null, $$0, this.g, this.h);
   }

   public static void a(axh.a $$0, wp $$1, wn $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(axi $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public vu d() {
      return Objects.requireNonNullElseGet(this.g, () -> vu.b(this.c()));
   }

   public Instant e() {
      return this.f.b();
   }

   public long f() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.e().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.e().plus(c));
   }

   public UUID g() {
      return this.d.c();
   }

   public boolean h() {
      return this.g().equals(i);
   }

   public boolean i() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.i() && this.d.c().equals($$0);
   }

   public boolean j() {
      return this.h.b();
   }

   public wp k() {
      return this.d;
   }

   @Nullable
   public wg l() {
      return this.e;
   }

   public wn m() {
      return this.f;
   }

   @Nullable
   public vu n() {
      return this.g;
   }

   public vy o() {
      return this.h;
   }
}
