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

public record wi(wn d, @Nullable we e, wl f, @Nullable vs g, vw h) {
   public static final MapCodec<wi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               wn.a.fieldOf("link").forGetter(wi::k),
               we.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               wl.a.forGetter(wi::m),
               vu.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vw.a.optionalFieldOf("filter_mask", vw.c).forGetter(wi::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new wi($$0x, (we)$$1.orElse(null), $$2, (vs)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static wi a(String $$0) {
      return a(i, $$0);
   }

   public static wi a(UUID $$0, String $$1) {
      wl $$2 = wl.a($$1);
      wn $$3 = wn.a($$0);
      return new wi($$3, null, $$2, null, vw.c);
   }

   public wi a(vs $$0) {
      vs $$1 = !$$0.equals(vs.b(this.c())) ? $$0 : null;
      return new wi(this.d, this.e, this.f, $$1, this.h);
   }

   public wi a() {
      return this.g != null ? new wi(this.d, this.e, this.f, null, this.h) : this;
   }

   public wi a(vw $$0) {
      return this.h.equals($$0) ? this : new wi(this.d, this.e, this.f, this.g, $$0);
   }

   public wi a(boolean $$0) {
      return this.a($$0 ? this.h : vw.c);
   }

   public wi b() {
      wl $$0 = wl.a(this.c());
      wn $$1 = wn.a(this.g());
      return new wi($$1, null, $$0, this.g, this.h);
   }

   public static void a(awx.a $$0, wn $$1, wl $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(awy $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public vs d() {
      return Objects.requireNonNullElseGet(this.g, () -> vs.b(this.c()));
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

   public wn k() {
      return this.d;
   }

   @Nullable
   public we l() {
      return this.e;
   }

   public wl m() {
      return this.f;
   }

   @Nullable
   public vs n() {
      return this.g;
   }

   public vw o() {
      return this.h;
   }
}
