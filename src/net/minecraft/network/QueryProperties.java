package net.minecraft.network;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;

public class QueryProperties {
   public static final QueryProperties EMPTY = new QueryProperties("", Map.of());
   private static final Splitter PROPERTY_SPLITTER = Splitter.on('&');
   private @Nullable String flat;
   private @Nullable Map<String, String> map;

   private QueryProperties(final @Nullable String flat, final @Nullable Map<String, String> map) {
      this.flat = flat;
      this.map = map;
   }

   public boolean isEmpty() {
      return this.flat != null && this.flat.isEmpty() || this.map != null && this.map.isEmpty();
   }

   public static QueryProperties fromMap(final Map<String, String> map) {
      return map.isEmpty() ? EMPTY : new QueryProperties(null, map);
   }

   public static QueryProperties fromString(final String flat) {
      return flat.isEmpty() ? EMPTY : new QueryProperties(flat, null);
   }

   public @Nullable String get(final String key) {
      return this.asMap().get(key);
   }

   public QueryProperties with(final String key, final String value) {
      return fromMap(Util.copyAndPut(this.asMap(), key, value));
   }

   public String asString() {
      if (this.flat == null) {
         StringBuilder result = new StringBuilder();
         boolean first = true;

         for (Entry<String, String> entry : Objects.requireNonNull(this.map).entrySet()) {
            if (!first) {
               result.append('&');
            }

            result.append(escape(entry.getKey()));
            String value = entry.getValue();
            if (!value.isEmpty()) {
               result.append('=');
               result.append(escape(value));
            }

            first = false;
         }

         this.flat = result.toString();
      }

      return this.flat;
   }

   public Map<String, String> asMap() {
      if (this.map == null) {
         Builder<String, String> result = ImmutableMap.builder();

         for (String property : PROPERTY_SPLITTER.split(Objects.requireNonNull(this.flat))) {
            readProperty(property, result);
         }

         this.map = result.buildKeepingLast();
      }

      return this.map;
   }

   public QueryProperties forceParse() {
      return fromMap(this.asMap());
   }

   private static void readProperty(final String property, final Builder<String, String> result) {
      int separator = property.indexOf(61);
      String key;
      String value;
      if (separator >= 0) {
         key = unescape(property.substring(0, separator));
         value = unescape(property.substring(separator + 1));
      } else {
         key = unescape(property);
         value = "";
      }

      result.put(key, value);
   }

   private static String escape(final String s) {
      return URLEncoder.encode(s, StandardCharsets.UTF_8);
   }

   private static String unescape(final String s) {
      return URLDecoder.decode(s, StandardCharsets.UTF_8);
   }

   @Override
   public String toString() {
      return this.asString();
   }

   @Override
   public boolean equals(final Object o) {
      return o instanceof QueryProperties that && Objects.equals(this.asMap(), that.asMap());
   }

   @Override
   public int hashCode() {
      return this.asMap().hashCode();
   }
}
