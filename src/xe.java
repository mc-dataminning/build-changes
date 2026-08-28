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

public record xe(xj d, @Nullable xa e, xh f, @Nullable wo g, ws h) {
   public static final MapCodec<xe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xj.a.fieldOf("link").forGetter(xe::k),
               xa.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xh.a.forGetter(xe::m),
               wq.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               ws.a.optionalFieldOf("filter_mask", ws.c).forGetter(xe::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xe($$0x, (xa)$$1.orElse(null), $$2, (wo)$$3.orElse(null), $$4))
   );
   private static final UUID i = af.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xe a(String $$0) {
      return a(i, $$0);
   }

   public static xe a(UUID $$0, String $$1) {
      xh $$2 = xh.a($$1);
      xj $$3 = xj.a($$0);
      return new xe($$3, null, $$2, null, ws.c);
   }

   public xe a(wo $$0) {
      wo $$1 = !$$0.equals(wo.b(this.c())) ? $$0 : null;
      return new xe(this.d, this.e, this.f, $$1, this.h);
   }

   public xe a() {
      return this.g != null ? new xe(this.d, this.e, this.f, null, this.h) : this;
   }

   public xe a(ws $$0) {
      return this.h.equals($$0) ? this : new xe(this.d, this.e, this.f, this.g, $$0);
   }

   public xe a(boolean $$0) {
      return this.a($$0 ? this.h : ws.c);
   }

   public xe b() {
      xh $$0 = xh.a(this.c());
      xj $$1 = xj.a(this.g());
      return new xe($$1, null, $$0, this.g, this.h);
   }

   public static void a(azl.a $$0, xj $$1, xh $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azm $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public wo d() {
      return Objects.requireNonNullElseGet(this.g, () -> wo.b(this.c()));
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

   public xj k() {
      return this.d;
   }

   @Nullable
   public xa l() {
      return this.e;
   }

   public xh m() {
      return this.f;
   }

   @Nullable
   public wo n() {
      return this.g;
   }

   public ws o() {
      return this.h;
   }
}
